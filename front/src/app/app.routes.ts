import { Routes } from "@angular/router";
import { HomeComponent } from "./shared/features/home/home.component";
import { LoginComponent } from "./shared/login/login.component";
import { RegisterComponent } from "./shared/register/register.component";
import { AuthGuard } from "service/auth.guard";

export const APP_ROUTES: Routes = [
  {
    path: "home",
    component: HomeComponent,
  },
  {
    path: "products",
    loadChildren: () =>
      import("./products/products.routes").then((m) => m.PRODUCTS_ROUTES),
    canActivate:[AuthGuard]
  },
  {
    path: "login",
    component: LoginComponent,
  },
  {
    path: "register",
    component: RegisterComponent,
  },
  { 
    path: "", 
    redirectTo: "home", 
    pathMatch: "full" 
  },

];
