<template>
  <div class="content">
    <li
      v-for="order in orderList"
      :key="order"
    >
      <img class="img" src="../assets/food.png" alt="">
      <div class="detail">
        {{order.m_name}}
        <div class="price">
          {{order.m_price}}元
        </div>
      </div>
      <div class="count">
        x{{order.d_num}}
      </div>
    </li>
    <div>
      合计：{{total}}
      <el-button
          type="primary"
          style="transform: translateX(13em)"
          @click="pay"
          :disabled="canClick"
      >支付</el-button>
    </div>
  </div>
</template>

<script>
  import axios from "axios";

  export default {
    name: "myOrder",
    data() {
      return {
        orderList: [],
        table_num: this.$route.params.table_num,
        total: "",
        canClick: false
      };
    },
    created() {
      this.getOrder();
      this.getTotalPrice();
    },
    methods: {
      getOrder() {

        axios.get("http://localhost:8081/selectMenusOrderById/" + this.table_num)
          .then(response => {
            this.orderList = response.data;
          });
      },
      getTotalPrice() {
        axios.get("http://localhost:8081/sumPrice/" + this.table_num)
          .then(response => {

            this.total = response.data;
          });
      },
      pay() {
        this.$message.success("支付成功");
        this.canClick = true;
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
    border: 1px solid red;
  }

  .detail {
    display: inline-block;
    margin-left: 30px;
  }

  .price {
    margin-top: 3.5em;
  }

  .count {
    float: right;
    margin-top: 20px;
    margin-right: 3em;
  }
</style>