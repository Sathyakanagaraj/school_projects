package model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name="teacher")
public class Teacher {
    @Id
    private int T_Id_no;
    private String T_name;
    private String T_gender;
    private String T_dept;
    private String T_city;
    private Long T_mobile_no;

    public int getT_Id_no() {
        return T_Id_no;
    }

    public void setT_Id_no(int t_Id_no) {
        T_Id_no = t_Id_no;
    }

    public String getT_name() {
        return T_name;
    }

    public void setT_name(String t_name) {
        T_name = t_name;
    }

    public String getT_gender() {
        return T_gender;
    }

    public void setT_gender(String t_gender) {
        T_gender = t_gender;
    }

    public String getT_dept() {
        return T_dept;
    }

    public void setT_dept(String t_dept) {
        T_dept = t_dept;
    }

    public String getT_city() {
        return T_city;
    }

    public void setT_city(String t_city) {
        T_city = t_city;
    }

    public Long getT_mobile_no() {
        return T_mobile_no;
    }

    public void setT_mobile_no(Long t_mobile_no) {
        T_mobile_no = t_mobile_no;
    }


}
