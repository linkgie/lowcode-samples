import home_view_component from "./home.vue";
const home_view ={ key: "home.view", path:"/home.view",  component: home_view_component } ;

const VIEWS = [
home_view
];

export { VIEWS as Views, home_view as DefaultView };