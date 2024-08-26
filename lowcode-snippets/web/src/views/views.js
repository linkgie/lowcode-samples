import form_1_view_component from "./form-1.vue";
const form_1_view ={ key: "form-1.view", path:"/form-1.view",  component: form_1_view_component } ;
import form_2_view_component from "./form-2.vue";
const form_2_view ={ key: "form-2.view", path:"/form-2.view",  component: form_2_view_component } ;
import form_3_view_component from "./form-3.vue";
const form_3_view ={ key: "form-3.view", path:"/form-3.view",  component: form_3_view_component } ;
import grid_1_view_component from "./grid-1.vue";
const grid_1_view ={ key: "grid-1.view", path:"/grid-1.view",  component: grid_1_view_component } ;
import home_view_component from "./home.vue";
const home_view ={ key: "home.view", path:"/home.view",  component: home_view_component } ;
import tree_1_view_component from "./tree-1.vue";
const tree_1_view ={ key: "tree-1.view", path:"/tree-1.view",  component: tree_1_view_component } ;

const VIEWS = [
form_1_view,
form_2_view,
form_3_view,
grid_1_view,
home_view,
tree_1_view
];

export { VIEWS as Views, home_view as DefaultView };