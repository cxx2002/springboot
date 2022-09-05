package com.cxx.pojo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author 陈喜喜
 * @date 2022-08-03 21:54
 */
@Component
@ConfigurationProperties(prefix = "school")
public class SchoolInfo {
    private String name;
    private String address;
    private String website;

    @Override
    public String toString() {
        return "SchoolInfo{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", website='" + website + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public SchoolInfo() {
    }

    public SchoolInfo(String name, String address, String website) {
        this.name = name;
        this.address = address;
        this.website = website;
    }
}
