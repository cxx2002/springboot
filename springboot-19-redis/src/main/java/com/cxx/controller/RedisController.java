package com.cxx.controller;

import com.cxx.pojo.Student;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.data.redis.serializer.Jackson2JsonRedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author 陈喜喜
 * @date 2022-08-13 15:41
 * StringRedisTemplate :把 k , V都是作为String处理，使用的是String的序列化，可读性好
 * RedisTemplate :把 k , V经过了JDK的序列化存到redis。k , V是序列化的内容，不能直接识别
 * 或者手动设置RedisTemplate的序列化为String的序列化：
 * redisTemplate.setKeySerializer(new StringRedisSerializer());
 * redisTemplate.setValueSerializer(new StringRedisSerializer());
 * json的序列化与反序列化（redis不可以存中文，但是可以存中文序列化后的字符串，反序列化后就可以得到中文了）
 * redisTemplate.setKeySerializer(new StringRedisSerializer());
 * redisTemplate.setValueSerializer(new Jackson2JsonRedisSerializer(Student.class));
 */
@RestController
public class RedisController {
    /**
     * 注入RedisTemplate
     * RedisTemplate 泛型
     * 1.RedisTemplate<String,String>
     * 2.RedisTemplate<Object,Object>
     * 3.RedisTemplate
     * 注意：RedisTemplate对象的名称只能是redisTemplate
     */
    @Resource
    private RedisTemplate redisTemplate;
    @Resource
    private StringRedisTemplate stringRedisTemplate;
    /**
     * private final ValueOperations<K, V> valueOps = new DefaultValueOperations(this);
     * private final ListOperations<K, V> listOps = new DefaultListOperations(this);
     * private final SetOperations<K, V> setOps = new DefaultSetOperations(this);
     * private final StreamOperations<K, ?, ?> streamOps = new DefaultStreamOperations(this, ObjectHashMapper.getSharedInstance());
     * private final ZSetOperations<K, V> zSetOps = new DefaultZSetOperations(this);
     * private final GeoOperations<K, V> geoOps = new DefaultGeoOperations(this);
     * private final HyperLogLogOperations<K, V> hllOps = new DefaultHyperLogLogOperations(this);
     * private final ClusterOperations<K, V> clusterOps = new DefaultClusterOperations(this);
     */

    //添加数据到redis
    @PostMapping("redis/addstring")
    public String addToRedis(String key, String value){
        //操作Redis中String类型的数据，需要先获取ValueOperations对象
        ValueOperations valueOperations = redisTemplate.opsForValue();

        valueOperations.set(key,value);

        return "向redis添加String类型数据  key=" + key + "|value=" + value;
    }

    //获取redis的数据
    @GetMapping("/redis/getk")
    public String getRedisDate(String key){
        ValueOperations valueOperations = redisTemplate.opsForValue();
        Object value = valueOperations.get(key);
        return "key=" + key + "|value=" + value.toString();
    }

    //添加数据到redis
    @PostMapping("redis/{key}/{value}")
    public String addKVRedis(@PathVariable String key, @PathVariable String value){
        //操作Redis中String类型的数据，需要先获取ValueOperations对象
        stringRedisTemplate.opsForValue().set(key,value);
        return "向redis添加String类型数据  key=" + key + "|value=" + value;
    }

    //获取redis的数据
    @GetMapping("/redis/getstr/{key}")
    public String getRedisV(@PathVariable String key){

        String value = stringRedisTemplate.opsForValue().get(key);
        return "key=" + key + "|value=" + value;
    }

    /**
     * 使用json序列化,把java对象转为json字符串存储
     */
    @PostMapping("/redis/addjson")
    public String addJson(String key, String name, Integer id, Integer age){
        Student student = new Student(id, name, age);
        redisTemplate.setKeySerializer(new StringRedisSerializer());
        redisTemplate.setValueSerializer(new Jackson2JsonRedisSerializer(Student.class));

        redisTemplate.opsForValue().set(key,student);

        return "添加成功json----"+ student;
    }

    //反序列化json
    @PostMapping("/redis/getjson")
    public String getjson(String key){
        redisTemplate.setKeySerializer(new StringRedisSerializer());
        redisTemplate.setValueSerializer(new Jackson2JsonRedisSerializer(Student.class));

        Object stduent = redisTemplate.opsForValue().get(key);
        return "反序列化json对象key="+stduent;
    }

}
