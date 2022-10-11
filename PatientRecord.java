package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class PatientRecord {


        @Id
        private long id;
        private String name;
        private Integer age;
        private String address;

        public PatientRecord(long id, String name,Integer age, String address) {
            this.id = id;
            this.name = name;
            this.age=age;
            this.address = address;
        }

        public PatientRecord() {

        }

    public static Object builder() {
           return builder();
    }

    public long getPatientId() {
            return id;
        }

        public void setPatientId(Integer id) {
            this.id = id;
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


}
