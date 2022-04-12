package com.company.condition;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Status {
    private String base;
    private String repair;
    private String road;

    @Override
    public String toString() {
        return "Status{" +
                "base='" + base + '\'' +
                ", repair='" + repair + '\'' +
                ", road='" + road + '\'' +
                '}';
    }

}
