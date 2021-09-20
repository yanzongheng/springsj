import {createRouter, createWebHistory} from 'vue-router'
import home from "@/components/home";
import menuLList from "@/components/menuList";
import myOrder from "@/components/myOrder";

const routerHistory = createWebHistory();

const router = createRouter({
  mode: "history",
  history: routerHistory,

  routes: [
    {
      path: '/',
      component: home
    },
    {
      path: '/menu/:table_num',
      component: menuLList
    },
    {
      path:'/myOrder/:table_num',
      component: myOrder
    }
  ]
});

export default router;