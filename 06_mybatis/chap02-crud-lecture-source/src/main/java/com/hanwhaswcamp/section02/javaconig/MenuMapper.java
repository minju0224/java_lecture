package com.hanwhaswcamp.section02.javaconig;

import org.apache.ibatis.annotations.*;

import java.util.List;

public interface MenuMapper {
    @Results(id="menuResultMap", value = {
            @Result(id = true, property = "menuCode", column = "menu_code"),
            @Result(property = "menuName", column = "menu_name"),
            @Result(property = "menuPrice", column = "menu_price"),
            @Result(property = "categoryCode", column = "category_code"),
            @Result(property = "orderableStatus", column = "orderable_status")
    })
    @Select("Select\n" +
            "            menu_code\n" +
            "          , menu_name\n" +
            "          , menu_price\n" +
            "          , category_code\n" +
            "          , orderable_status\n" +
            "        from tbl_menu\n" +
            "        where orderable_status = 'Y'\n" +
            "        order by menu_code")
    List<MenuDTO> selectAllMenu();

    @ResultMap("menuResultMap") // 위에서 @Results 어노테이션을 이용해 선언 된 id 재사용
    @Select("select\n" +
            "            menu_code\n" +
            "          , menu_name\n" +
            "        , menu_price\n" +
            "        , category_code\n" +
            "        , orderable_status\n" +
            "        from tbl_menu\n" +
            "        where orderable_status = 'Y'\n" +
            "         and menu_code = #{ menuCode }")
    MenuDTO selectMenuByMenuCode(int menuCode);

    @Insert(" Insert into\n" +
            "            tbl_menu(menu_name,menu_price,category_code,orderable_status)\n" +
            "        values\n" +
            "            (#{menuName},#{menuPrice}, #{categoryCode},'Y')")
    int insertMenu(MenuDTO menu);

    @Update("        Update\n" +
            "            tbl_menu set\n" +
            "                menu_name = #{menuName},\n" +
            "                menu_price = #{menuPrice},\n" +
            "                category_code = #{categoryCode}\n" +
            "        where menu_code = #{menuCode}")
    int modifytMenu(MenuDTO menu);

    @Delete("        delete\n" +
            "             from tbl_menu\n" +
            "                where menu_code = #{menuCode}")
    int deleteMenu(int menuCode);
}
