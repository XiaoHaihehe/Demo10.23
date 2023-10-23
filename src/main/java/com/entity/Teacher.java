package com.entity;

public class Teacher {
    private String tno;
    private String name;
    private char sex;
    private String birthday;
    private String prof;
    private String depart;

    public Teacher(String tno, String name, char sex, String birthday, String prof, String depart) {
        this.tno = tno;
        this.name = name;
        this.sex = sex;
        this.birthday = birthday;
        this.prof = prof;
        this.depart = depart;
    }

    public Teacher() {
    }

    public String getTno() {
        return tno;
    }

    public void setTno(String tno) {
        this.tno = tno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getProf() {
        return prof;
    }

    public void setProf(String prof) {
        this.prof = prof;
    }

    public String getDepart() {
        return depart;
    }

    public void setDepart(String depart) {
        this.depart = depart;
    }
}
