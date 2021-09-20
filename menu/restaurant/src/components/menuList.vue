<template>
  <div class="all">
    <div class="content">
      <li
          v-for="(menu,index) in menu_list"
          :key="menu"
      >
        <img class="img" src="../assets/food.png" alt="">
        <div class="detail">
          {{menu.m_name}}
          <div class="price">
            {{menu.m_price}}元
          </div>
        </div>
        <el-input-number
            v-model="num[index]"
            :min="0"
            size="mini"
            class="btn"
        ></el-input-number>
      </li>
    </div>
    <el-button type="primary" @click="goMyOrder" class="myOrder">我的订单</el-button>
  </div>
</template>

<script>
  import axios from "axios";
  import {order} from "@/class/order.js";

  export default {
    name: "menuList",
    data() {
      return {
        menu_list: [],
        table_num: this.$route.params.table_num,
        num: [],
        order_list: []
      };
    },
    created() {
      this.getMenu();
    },
    methods: {
      getMenu() {

        axios.get("http://localhost:8081/selectMenus")
          .then(response => {

            this.menu_list = response.data;
            this.num = new Array(this.menu_list.length).fill(0);
          });
      },
      goMyOrder() {

        for (let i = 0; i < this.num.length; i++) {

          if (this.num[i] > 0) {

            let temp = new order(this.table_num, this.menu_list[i].m_id, this.num[i]);
            this.order_list.push(temp);
          }
        }

        axios.post("http://localhost:8081/insertMenusOrder", this.order_list)
          .then();

        this.$router.push("/myOrder/" + this.table_num);
      }
    }
  }
</script>

<style scoped>
  li {
    list-style: none;
    margin-bottom: 20px;
    border-bottom: 1px solid red;
  }

  .img {
    height: 100px;
    width: 100px;
    vertical-align: top;
  }

  .content {
    width: 50%;
    transform: translateX(50%);
    display: inline-block;
    vertical-align: top;
  }

  .detail {
    display: inline-block;
    margin-left: 30px;
  }

  .price {
    margin-top: 3.5em;
  }

  .btn {
    float: right;
    margin-top: 20px;
    margin-right: 3em;
  }

  .myOrder {
    float: right;
  }
</style>