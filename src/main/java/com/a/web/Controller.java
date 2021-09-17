package com.a.web;



import com.a.entity.Customer;
import com.a.entity.MenusOrder;
import com.a.entity.Order;
import com.a.entity.Table;
import com.a.service.CustomerService;
import com.a.service.MenusOrderService;
import com.a.service.OrderService;
import com.a.service.TableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Controller {

    @Autowired
    private CustomerService customer;


    @PostMapping("/insertCustomer")
    public void insertCustomer1() {
        Customer c = new Customer("F", "man", "555555", "1", "1");
        customer.insertCustomer(c);
    }

    @GetMapping("/selectCustomer")
    public List<Customer> selectCustomer1() {
        List<Customer> c = customer.selectCustomer();

        return c;
    }


    @DeleteMapping("/deleteCustomer")
    public void deleteCustomer1() {
        customer.deleteCustomer(1);

    }


    @Autowired
    private TableService tableService;


    @GetMapping("/selectTable")
    public List<Table> selectTable1() {
        List<Table> t = tableService.selectTable();

        return t;
    }

    @PutMapping("/updateTable")
    public void updateTable() {
        tableService.updateTableYes();
        tableService.updateTableNo();
    }


    @Autowired
    private OrderService orderService;

    @GetMapping("/selectOrder")
    public List<Order> selectOrder1() {
        List<Order> t = orderService.selectTable();

        return t;
    }

    @PostMapping("/insertOrder")
    public void insertOrder1() {
        Order order = new Order("1", "1", "1", "2000-1-1 19:00:50", "0");
        orderService.insertOrder(order);
    }

    @GetMapping("/sumPrice")
    public void sumPrice1() {
        orderService.sumPrice(1);

    }




    @Autowired
    private MenusOrderService menusOrderService;


    @PostMapping("/insertMenusOrder")
    public void insertMenusOrder1(){
        MenusOrder menusOrder = new MenusOrder("1", "1", "1");
        MenusOrder menusOrder1 = new MenusOrder("1", "2", "2");
        menusOrderService.insertMenusOrder(menusOrder);
        menusOrderService.insertMenusOrder(menusOrder1);
    }

    @GetMapping("/selectMenusOrder")
    public List<MenusOrder> selectMenusOrder1(){
        List<MenusOrder> menusOrders = menusOrderService.selectMenusOrder();
        return menusOrders;

    }



}
