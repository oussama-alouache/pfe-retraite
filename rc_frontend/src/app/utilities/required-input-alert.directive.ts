import { Directive, ElementRef, Renderer2, HostListener, Input } from '@angular/core';

@Directive({
  selector: '[appRequiredInputAlert]'
})
export class RequiredInputAlertDirective {
  private alertElement: HTMLElement | null | undefined;

  constructor(private el: ElementRef, private renderer: Renderer2) { }

  @Input('appRequiredInputAlert') set appRequiredInputAlert(required: boolean) {
    if (required) {
      this.showAlert();
    } else {
      this.hideAlert();
    }
  }

  @HostListener('input', ['$event.target.value']) onInput(value: string) {
    if (value.trim() === '') {
      this.showAlert();
    } else {
      this.hideAlert();
    }
  }

  private showAlert() {
    this.alertElement = this.renderer.createElement('div');
    this.renderer.addClass(this.alertElement, 'alert alert-danger');
    this.renderer.appendChild(this.alertElement, this.renderer.createText('This field is required.'));
    this.renderer.appendChild(this.el.nativeElement, this.alertElement);
  }

  private hideAlert() {
    if (this.alertElement) {
      this.renderer.removeChild(this.el.nativeElement, this.alertElement);
      this.alertElement = null;
    }
  }
}
