package com.monster.model;

import java.io.IOException;
import java.util.List;

public class Test {
    public static void main(String[] args) throws IOException {

        MonsterJDBCDAO dao = new MonsterJDBCDAO();

        /**新增(成功)*/
//        MonsterVO monsterVO1 = new MonsterVO();
//        monsterVO1.setM_name("五條");
//        monsterVO1.setM_tybe("T_5");
//        monsterVO1.setM_luckySkill("LuckySkill0002");
//        monsterVO1.setM_hit("Hit02");
//        monsterVO1.setM_combatType("CombatType0005");
//
//        monsterVO1.setM_rarity("rarity02");
//        monsterVO1.setM_race("race0007");
//        monsterVO1.setM_ftuit("有");
//        monsterVO1.setM_type("type0003");
//        monsterVO1.setM_friendskill1("力量驅動");
//
//        monsterVO1.setM_friendskill2("印記炸彈");
//        monsterVO1.setM_get("Get01");
//        monsterVO1.setM_spec("超強");
//        monsterVO1.setM_pool("咒術回戰");
//        dao.insert(monsterVO1);
//        System.out.println("成功新增");
//        System.out.println("---------------------");

        /**更新(成功)*/
//        MonsterVO monsterVO2 = new MonsterVO();
//        monsterVO2.setM_name("意翔");
//        monsterVO2.setM_tybe("T_2");
//        monsterVO2.setM_luckySkill("LuckySkill0003");
//        monsterVO2.setM_hit("Hit01");
//        monsterVO2.setM_combatType("CombatType0004");
//        monsterVO2.setM_rarity("rarity02");
//        monsterVO2.setM_race("race0015");
//        monsterVO2.setM_ftuit("有");
//        monsterVO2.setM_type("type0003");
//        monsterVO2.setM_friendskill1("漸伸線領域・More");
//        monsterVO2.setM_friendskill2("漸伸線領域・Narrow");
//        monsterVO2.setM_get("Get02");
//        monsterVO2.setM_spec("超強強");
//        monsterVO2.setM_pool("鬼滅");
//        monsterVO2.setM_no("M0007");
//        dao.update(monsterVO2);
//        System.out.println("成功更新");
//        System.out.println("---------------------");

        /**刪除(成功)*/
//        dao.delete("M0006");
//        System.out.println("成功刪除");
//        System.out.println("---------------------");

        /**查詢_名稱(M_name)*/
        /**查詢_屬性(M_tybe)*/
        /**查詢_擊種(M_hit)*/
        /**查詢_戰型(M_combatType)*/
        /**查詢_稀有度(M_rarity)*/
        /**查詢_種族(M_race)*/
        /**查詢_取得方式(M_get)*/
        /**查詢_卡池(M_pool)*/
        /**查詢_全部*/
        List<MonsterVO> list = dao.getAllMonsters();
        for (MonsterVO allMonsters : list) {
            System.out.println(allMonsters.getM_no() + ",");
            System.out.println(allMonsters.getM_name() + ",");
            System.out.println(allMonsters.getM_tybe() + ",");
            System.out.println(allMonsters.getM_luckySkill() + ",");
            System.out.println(allMonsters.getM_hit() + ",");
            System.out.println(allMonsters.getM_combatType() + ",");
            System.out.println(allMonsters.getM_rarity() + ",");
            System.out.println(allMonsters.getM_race() + ",");
            System.out.println(allMonsters.getM_ftuit() + ",");
            System.out.println(allMonsters.getM_type() + ",");
            System.out.println(allMonsters.getM_friendskill1() + ",");
            System.out.println(allMonsters.getM_friendskill2() + ",");
            System.out.println(allMonsters.getM_get() + ",");
            System.out.println(allMonsters.getM_spec() + ",");
            System.out.println(allMonsters.getM_pool() + ",");
            System.out.println(allMonsters.getM_createtime() + ",");
            System.out.println(allMonsters.getM_updatetime() + ",");
            System.out.println("");

            System.out.println("成功查詢全部角色");
            System.out.println("---------------------");
        }

    }
}
