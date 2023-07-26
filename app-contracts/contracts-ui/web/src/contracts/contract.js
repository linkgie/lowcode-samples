export default {
  name: "demo-contracts",

  mounted() {
    const THIS = this;
    setTimeout(() => {
        THIS.$refs["contract-form"].create({
          code: "CN-2089726-8032",
          amount: 0,
        });
        
    }, 100);
  },

  methods: {},
};
