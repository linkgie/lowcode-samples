export default {
  name: "demo-contracts",

  data() {
    return {
      groupPattern: "card",
      formLayout: "bottom",
      labelAlign: "left",
    };
  },

  computed: {
    btnCardPattern() {
      if ("card" == this.groupPattern) {
        return "primary-icon-text";
      }
      return "icon-text";
    },
    btnTabPattern() {
      if ("tab" == this.groupPattern) {
        return "primary-icon-text";
      }
      return "icon-text";
    },
    btnDividerPattern() {
      if ("divider" == this.groupPattern) {
        return "primary-icon-text";
      }
      return "icon-text";
    },
    btnNonePattern() {
      if (undefined == this.groupPattern) {
        return "primary-icon-text";
      }
      return "icon-text";
    },


    disableGroup(){
      const disable = this.groupPattern == undefined;
      console.log("-------- 分组禁用状态：", disable)
      return disable;
    },

 

    btnTopLayout() {
      if ('top' == this.formLayout) {
        return "primary-icon-text";
      }
      return "icon-text";
    },

    btnRightLayout() {
      if ('right' == this.formLayout) {
        return "primary-icon-text";
      }
      return "icon-text";
    },

    btnBottomLayout() {
      if ('bottom' == this.formLayout) {
        return "primary-icon-text";
      }
      return "icon-text";
    },

    btnLeftLayout() {
      if ('left' == this.formLayout) {
        return "primary-icon-text";
      }
      return "icon-text";
    },

    formMaxWidth(){
      if ('top' == this.formLayout || 'bottom' == this.formLayout) {
        return "840px";
      }
      return "1160px";
    },

    btnLabelLeftPattern() {
      if ('left' == this.labelAlign) {
        return "primary-icon-text";
      }
      return "icon-text";
    },

    btnLabelRightPattern() {
      if ('right' == this.labelAlign) {
        return "primary-icon-text";
      }
      return "icon-text";
    },

    btnLabelTopPattern() {
      if ('top' == this.labelAlign) {
        return "primary-icon-text";
      }
      return "icon-text";
    },
  },

  watch: {
    groupPattern(newValue, oldValue){
      console.log("--------- groupPattern changed... newValue=", newValue, "     oldValue=", oldValue);
    }
  },

  mounted() {
    const THIS = this;
    setTimeout(() => {
      THIS.$refs["contract-form"].create({
        code: "CN-2089726-8032",
        amount: 0,
      });
    }, 100);
  },

  methods: {
    setGroupPattern(groupPattern) {
      this.groupPattern = groupPattern;
    },
    setLayout(layout) {
      this.formLayout = layout;
    },
    setLabelAlign(align){
      this.labelAlign=align;
    }
  },
};
