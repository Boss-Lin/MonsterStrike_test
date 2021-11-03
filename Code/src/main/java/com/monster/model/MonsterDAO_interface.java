package com.monster.model;

import com.manager.model.ManagerVO;

import javax.swing.*;
import java.util.List;

public interface MonsterDAO_interface {
    /**
     * 新增
     * 更新
     * 刪除
     * 用名稱搜尋角色(M_name)
     * 用屬性搜尋角色(M_tybe)
     * 用擊種搜尋角色(M_hit)
     * 用戰型搜尋角色(M_combatType)
     * 用稀有度搜尋角色(M_rarity)
     * 用種族搜尋角色(M_race)
     * 用取得方式搜尋角色(M_get)
     * 用卡池搜尋角色(M_pool)
     * 用搜尋角色()//備用
     * 顯示全部角色
     */

    public String insert(MonsterVO monsterVO);
    public void update (MonsterVO monsterVO);
    public void delete (String M_no);
    public List<MonsterVO> findByName(String M_name);
    public List<MonsterVO> findByTybe(String M_tybe);
    public List<MonsterVO> findByHit(String M_hit);
    public List<MonsterVO> findByCombatype(String M_combatType);
    public List<MonsterVO> findByRarity(String M_rarity);
    public List<MonsterVO> findByRace(String M_race);
    public List<MonsterVO> findByGet(String M_get);
    public List<MonsterVO> findByPool(String M_pool);
//    public List<MonsterVO> findBy(); //備用
    public List<MonsterVO> getAllMonsters();
}
