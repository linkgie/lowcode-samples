<template>
  <x-view title="基本表单">
    <h1><x-icon icon="bs-svg-brightness-high" width="1.5rem" height="1.5rem" /> 演示基本表单 </h1>

    <x-divider></x-divider>

    <x-dataform
      title="样例数据"

      writeonly

      data-interface="my.galaxy.demos.sample_001.sample1.web.SampleVO"
      data-binding="ds-sample-data"
    >

    </x-dataform>

    <x-datasource
      name="ds-sample-data"
      model="my.galaxy.demos.sample_001.sample1.web.SampleVO"
      default-current-row-index="0"
    >

      <x-http-binding name="query" service="sample-controller" method="GET" path="/sample1/list"></x-http-binding>
      <x-http-binding name="update" service="sample-controller" method="PUT" path="/sample1/data" refresh></x-http-binding>

    </x-datasource>

  </x-view>
</template>

<!-- 脚本 -->
<script>
export default {

  // 组件属性
  props: {
    // ...
  },

  // 状态数据
  data() {
    return {
      //...
    };
  },

  // 注入属性
  // inject: [],

  // 计算属性
  computed: {},

  // 方法
  methods: {},
};
</script>

<!-- 样式 -->
<style scoped></style>
