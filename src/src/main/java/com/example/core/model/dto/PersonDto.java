package com.example.core.model.dto;

/**
 * @author songchuan.zhou
 */
public class PersonDto {
    /**
     * name
     */
    private String name;

    /**
     * age
     */
    private String age;

    /**
     * getter for name
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * setter for name
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * setter for age
     * @return
     */
    public String getAge() {
        return age;
    }

    /**
     * getter for age
     * @param age
     */
    public void setAge(String age) {
        this.age = age;
    }
}
