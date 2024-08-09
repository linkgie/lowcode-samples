import home_view_component from "./home.vue";
const home_view ={ key: "home.view", path:"/home.view",  component: home_view_component } ;
import simple_form_view_component from "./simple-form.vue";
const simple_form_view ={ key: "simple-form.view", path:"/simple-form.view",  component: simple_form_view_component } ;

const VIEWS = [
home_view,
simple_form_view
];

export { VIEWS as Views, home_view as DefaultView };