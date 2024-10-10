import { Component, EventEmitter, Output } from '@angular/core';
import { MatIcon } from "@angular/material/icon";
import { NgIf } from "@angular/common";

@Component({
  selector: 'app-sidebar',
  standalone: true,
  imports: [
    MatIcon,
    NgIf
  ],
  templateUrl: './sidebar.component.html',
  styleUrl: './sidebar.component.scss'
})
export class SidebarComponent {
  productsDropdown: boolean = false;
  salesDropdown: boolean = false;
  isMenuCollapsed: boolean = false;

  @Output() menuStateChanged = new EventEmitter<boolean>();

  changeProductsDropdownState(): void {
    this.productsDropdown = !this.productsDropdown;
  }

  changeSalesDropdownState(): void {
    this.salesDropdown = !this.salesDropdown;
  }

  toggleMenu(): void {
    this.isMenuCollapsed = !this.isMenuCollapsed;
    this.menuStateChanged.emit(this.isMenuCollapsed);
  }
}
