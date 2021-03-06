/*
 * JavaXYQ Source Code
 * by kylixs
 * at 2010-4-14
 * please visit http://javaxyq.googlecode.com
 * or mail to kylixs@qq.com
 */
package com.javaxyq.model;

import java.util.Arrays;
import java.util.List;

/**
 * ��Ϸ��Ʒ����
 * @author gongdewei
 * @date 2010-4-14 create
 */
public class ItemTypes {
	public static final int TYPE_MEDICINE = 0x1000; //ҩƷ
	public static final int TYPE_MEDICINE_HP = 0x1001;
	public static final int TYPE_MEDICINE_MP = 0x1002;
	public static final int TYPE_MEDICINE_HPMP = 0x1003;//hp+mp
	public static final int TYPE_MEDICINE_INJURY = 0x1004;//����
	public static final int TYPE_MEDICINE_RESURGENT = 0x1008;//����
	public static final int TYPE_MEDICINE_SP = 0x1010;//��ŭ
	public static final int TYPE_MEDICINE_SOBERUP  = 0x1020;//������쳣
	public static final int TYPE_MEDICINE_DETOXIFY  = 0x1040;//�ⶾ
	public static final int TYPE_MEDICINE_BREAKSEAL  = 0x1080;//�����ӡ
	
	public static final int TYPE_WEAPON = 0x2000; //����
	public static final int TYPE_WEAPON_SWORD = 0x2001;//��
	public static final int TYPE_WEAPON_MACHETES = 0x2002;//��
	public static final int TYPE_WEAPON_HAMMER = 0x2003;//��
	public static final int TYPE_WEAPON_CLAWTHORN = 0x2014;//צ��
	public static final int TYPE_WEAPON_LARGEAXE = 0x2005;//����
	public static final int TYPE_WEAPON_FAN = 0x2006;//��
	public static final int TYPE_WEAPON_SPEAR = 0x2007;//ǹì
	public static final int TYPE_WEAPON_WHIP = 0x2008;//��
	public static final int TYPE_WEAPON_WAND = 0x2009;//ħ��
	public static final int TYPE_WEAPON_RIBBON = 0x2010;//Ʈ��
	public static final int TYPE_WEAPON_HOOP = 0x2011;//��Ȧ
	public static final int TYPE_WEAPON_DOUBLEDAGGER = 0x2012;//˫�̽�
	
	public static final int TYPE_EQUIPMENT = 0x4000; //�·�װ��
	public static final int TYPE_EQUIPMENT_HELMET = 0x4001;//ͷ��
	public static final int TYPE_EQUIPMENT_JEWELRY = 0x4002;//����
	public static final int TYPE_EQUIPMENT_ARMOR = 0x4003;//����
	public static final int TYPE_EQUIPMENT_BELT = 0x4004;//����
	public static final int TYPE_EQUIPMENT_BOOTS = 0x4005;//Ь
	
	private static List<String> weaponTypes = Arrays.asList(new String[] {"��","��","��","צ��","����","��","ǹì","��","ħ��","Ʈ��","��Ȧ","˫��"});
	
	/**
	 * ��ȡ��Ʒ������
	 * @param item
	 * @return
	 */
	public static int getType(Item item) {
		return Integer.valueOf(item.getType(),16);
	}
	
	/**
	 * �ж���Ʒ������
	 * @param item
	 * @param type
	 * @return
	 */
	public static boolean isType(Item item,int type) {
		return (getType(item) & type) == type;
	}

	public static boolean isMedicine(Item item) {
		return (getType(item) & TYPE_MEDICINE)==TYPE_MEDICINE;
	}
	public static boolean isHpMedicine(Item item) {
		return (getType(item) & TYPE_MEDICINE_HP)==TYPE_MEDICINE_HP;
	}
	public static boolean isMpMedicine(Item item) {
		return (getType(item) & TYPE_MEDICINE_MP)==TYPE_MEDICINE_MP;
	}
	
	public static boolean isWeapon(Item item) {
//		return (getType(item) & TYPE_WEAPON)==TYPE_WEAPON;
		return weaponTypes.contains(item.getType());
	}
	public static boolean isEquipment(Item item) {
		return (getType(item) & TYPE_EQUIPMENT)==TYPE_EQUIPMENT;
	}
	
	
}
