
const Metadata = {
    // 数据集的操作按钮；
    actions: [
        { name: "新增", key: "add", icon: "el-svg-plus" },
        { name: "刷新", key: "refresh", group: "query", icon: "el-svg-refresh" },
    ],

    /**
     * 行编辑按钮；
     */
    row: {
        actions: [
            { name: "编辑", key: "edit", icon: "el-svg-edit" },
            { name: "删除", key: "delete", icon: "el-svg-delete" },
        ],
    },
};

export default {
    name: "demo-view",



    // 属性；
    props: {
        // 数据源；
        datasource: {},
    },

    data() {
        
        return {
            metadata: Metadata,
            passwords:{},
        };
    },

    inject: ["serviceContext"],

    // 事件；
    emits: {},

    methods: {

    },
};
