import { Component } from '@angular/core';
import { ExternalCameraPlugin } from '@ionic-native/external-camera-plugin/ngx'

@Component({
  selector: 'app-home',
  templateUrl: 'home.page.html',
  styleUrls: ['home.page.scss'],
})
export class HomePage {

  constructor(private externalCameraPlugin: ExternalCameraPlugin) {}

  public startExternalCamera(){
    this.externalCameraPlugin.start().then();
  }
}
