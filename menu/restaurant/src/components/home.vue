<template>
  <div class="home">
    <div class="title">请选择座位号</div>
    <li
        :class="seat.t_status?`selected`:`un-selected`"
        v-for="(seat,index) in seatNum"
        :key="seat"
        @click="goMenu(index)"
    >
      {{seat.t_id}}
    </li>
  </div>
</template>

<script>
  import axios from 'axios';

  export default {
    name: "home",
    data() {
      return {
        seatNum: [],
      };
    },
    created() {

      this.getTable();
    },
    methods: {
      getTable() {
        axios.get("http://localhost:8081/selectTable")
          .then(response => {

            this.seatNum = response.data;
          });
      },
      goMenu(index) {

        let table_num = this.seatNum[index].t_id;

        axios.put("http://localhost:8081/updateTable/" + table_num);

        if (!this.seatNum[index].t_status) {

          this.$router.push("/menu/" + table_num);
        }
      }
    }
  }
</script>

<style scoped>
  .home {
    text-align: center;
  }
  .title {
    font-size: 3em;
    font-family: 黑体,serif;
  }
  .un-selected {
    height: 100px;
    width: 100px;
    list-style: none;
    float: left;
    margin-left: 100px;
    margin-top: 20px;
    line-height: 100px;
    font-size: 5em;
    background-color: yellow;
    cursor: default;
  }

  .selected {
    height: 100px;
    width: 100px;
    list-style: none;
    float: left;
    margin-left: 100px;
    margin-top: 20px;
    line-height: 100px;
    font-size: 5em;
    background-color: red;
    cursor: default;
  }

</style>