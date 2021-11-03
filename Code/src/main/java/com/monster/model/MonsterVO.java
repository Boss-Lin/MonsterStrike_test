package com.monster.model;

import java.sql.Timestamp;

public class MonsterVO implements java.io.Serializable {
    private String M_no;
    private String M_name;
//    private String M_pic;角色圖片，先略過
    private String M_tybe;
//    private String PassiveSkill; 反陷阱能力，先略過
//    private String EnergySkill
//    private String InvolvedSkill;
    private String M_luckySkill;
    private String M_hit;
    private String M_combatType;
    private String M_rarity;
    private String M_race;
    private String M_ftuit;
    private String M_type;
    private String M_friendskill1;
    private String M_friendskill2;
    private String M_get;
    private String M_spec;
    private String M_pool;
    private Timestamp M_createtime;
    private Timestamp M_updatetime;

    public String getM_no() {
        return M_no;
    }

    public void setM_no(String M_no) {
        this.M_no = M_no;
    }

    public String getM_name() {
        return M_name;
    }

    public void setM_name(String M_name) {
        this.M_name = M_name;
    }

    public String getM_tybe() {
        return M_tybe;
    }

    public void setM_tybe(String M_tybe) {
        this.M_tybe = M_tybe;
    }

    public String getM_luckySkill() {
        return M_luckySkill;
    }

    public void setM_luckySkill(String M_luckySkill) {
        this.M_luckySkill = M_luckySkill;
    }

    public String getM_hit() {
        return M_hit;
    }

    public void setM_hit(String M_hit) {
        this.M_hit = M_hit;
    }

    public String getM_combatType() {
        return M_combatType;
    }

    public void setM_combatType(String M_combatType) {
        this.M_combatType = M_combatType;
    }

    public String getM_rarity() {
        return M_rarity;
    }

    public void setM_rarity(String M_rarity) {
        this.M_rarity = M_rarity;
    }

    public String getM_race() {
        return M_race;
    }

    public void setM_race(String M_race) {
        this.M_race = M_race;
    }

    public String getM_ftuit() {
        return M_ftuit;
    }

    public void setM_ftuit(String M_ftuit) {
        this.M_ftuit = M_ftuit;
    }

    public String getM_type() {
        return M_type;
    }

    public void setM_type(String M_type) {
        this.M_type = M_type;
    }

    public String getM_friendskill1() {
        return M_friendskill1;
    }

    public void setM_friendskill1(String M_friendskill1) {
        this.M_friendskill1 = M_friendskill1;
    }

    public String getM_friendskill2() {
        return M_friendskill2;
    }

    public void setM_friendskill2(String M_friendskill2) {
        this.M_friendskill2 = M_friendskill2;
    }

    public String getM_get() {
        return M_get;
    }

    public void setM_get(String M_get) {
        this.M_get = M_get;
    }

    public String getM_spec() {
        return M_spec;
    }

    public void setM_spec(String M_spec) {
        this.M_spec = M_spec;
    }

    public String getM_pool() {
        return M_pool;
    }

    public void setM_pool(String M_pool) {
        this.M_pool = M_pool;
    }

    public Timestamp getM_createtime() {
        return M_createtime;
    }

    public void setM_createtime(Timestamp M_createtime) {
        this.M_createtime = M_createtime;
    }

    public Timestamp getM_updatetime() {
        return M_updatetime;
    }

    public void setM_updatetime(Timestamp M_updatetime) {
        this.M_updatetime = M_updatetime;
    }
}
