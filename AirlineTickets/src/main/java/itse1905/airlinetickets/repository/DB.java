package itse1905.airlinetickets.repository;

import java.util.ArrayList;
import java.util.List;

public class DB {
    public static String DbCreation(){
        return "drop table if exists Department; " +
                "create table Department (dep_id integer primary key, dep_type varchar(100), dep_name varchar(100), sub_dep_num integer);";
    }

    public static List<String> dep_in(){
        List<String> departments = new ArrayList<>();
        departments.add("insert into Department values(11111, 'FCTC', 'CSSE', 6);");
        departments.add("insert into Department values(22222, 'FCTC', 'RET', 6);");
        departments.add("insert into Department values(33333, 'FCT', 'IS', 5);");
        departments.add("insert into Department values(44444, 'FCT', 'JUR', 5);");
        return departments;
    }
}
