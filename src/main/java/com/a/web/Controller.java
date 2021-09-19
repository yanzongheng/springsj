package com.a.web;



import com.a.entity.Menus;
import com.a.entity.MenusOrder;
import com.a.entity.MenusOrderAndMenus;
import com.a.entity.Table;
import com.a.service.MenusOrderAndMenusService;
import com.a.service.MenusOrderService;
import com.a.service.MenusService;
import com.a.service.TableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Controller {

    @Autowired
    private MenusService menus;


//    @PostMapping("/insertCustomer")
//    public void insertCustomer1() {
//        Customer c = new Customer("F", "man", "555555", "1", "1");
//        customer.insertCustomer(c);
//    }

    @GetMapping("/selectMenus")
    public List<Menus> selectMenus1() {
        List<Menus> c = menus.selectMenus();

        return c;
    }

//
//    @DeleteMapping("/deleteCustomer")
//    public void deleteCustomer1() {
//        customer.deleteCustomer(1);
//
//    }


    @Autowired
    private TableService tableService;


    @GetMapping("/selectTable")
    public List<Table> selectTable1() {
        List<Table> t = tableService.selectTable();

        return t;
    }

    @PutMapping("/updateTable/{tableId}")
    public void updateTable(@PathVariable("tableId") String tableId) {
        tableService.updateTableYes(tableId);
    }

//
//    @Autowired
//    private OrderService orderService;
//
//    @GetMapping("/selectOrder")
//    public List<Order> selectOrder1() {
//        List<Order> t = orderService.selectTable();
//
//        return t;
//    }
//
//    @PostMapping("/insertOrder")
//    public void insertOrder1(@RequestBody Order order) {
//        orderService.insertOrder(order);
//    }
//
//    @GetMapping("/sumPrice")
//    public int sumPrice1() {
//        return orderService.sumPrice(1);
//
//    }




    @Autowired
    private MenusOrderService menusOrderService;


    @PostMapping("/insertMenusOrder")
    public void insertMenusOrder1(@RequestBody List<MenusOrder> menusOrders){
        menusOrderService.insertMenusOrder(menusOrders);
    }

    @GetMapping("/selectMenusOrder/{tableId}")
    public List<MenusOrder> selectMenusOrder1(@PathVariable("tableId") String tableId){
        List<MenusOrder> menusOrders = menusOrderService.selectMenusOrder(tableId);
        return menusOrders;

    }

    @Autowired
    private MenusOrderAndMenusService menusOrderAndMenusService;
    @GetMapping("/selectMenusOrderById/{tableId}")
    public List<MenusOrderAndMenus> selectMenusOrderById1(@PathVariable("tableId") String tableId){
        List<MenusOrderAndMenus> menusOrders = menusOrderAndMenusService.selectMenusOrder(tableId);
        return menusOrders;

    }
}
