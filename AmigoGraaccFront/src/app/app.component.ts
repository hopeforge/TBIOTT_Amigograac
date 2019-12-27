import * as $ from "jquery";

import { Component } from "@angular/core";
import { setTheme } from 'ngx-bootstrap/utils';

@Component({
  selector: "app-root",
  templateUrl: "./app.component.html",
  styleUrls: ["./app.component.css"]
})
export class AppComponent {
  title = "Amigo GRAACC";


  toggle() {
    $("#sidebar").toggleClass("active");
  }
}
