import { FormsModule, ReactiveFormsModule } from "@angular/forms";
import { RouterModule, Routes } from "@angular/router";

import { BrowserAnimationsModule } from "@angular/platform-browser/animations";
import { BrowserModule } from "@angular/platform-browser";
import { CommonModule } from "@angular/common";
import { FooterComponent } from "./footer/footer.component";
import { NavbarComponent } from "./navbar/navbar.component";
import { NgModule } from "@angular/core";
import { SidebarComponent } from "./sidebar/sidebar.component";

@NgModule({
  declarations: [
    SidebarComponent,
    NavbarComponent,
    FooterComponent
  ],
  imports: [
    CommonModule,
    RouterModule,
    BrowserModule,
    FormsModule,
    BrowserAnimationsModule
  ],
  exports: [FooterComponent, SidebarComponent, NavbarComponent]
})
export class CoreModule {}
