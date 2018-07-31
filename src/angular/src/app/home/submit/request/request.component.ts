import { Component, OnInit } from '@angular/core';
import { FormGroup, FormControl } from '@angular/forms';

@Component({
  selector: 'app-request',
  templateUrl: './request.component.html',
  styleUrls: ['./request.component.css']
})
export class RequestComponent implements OnInit {
  formData: any = {};

  requestForm: FormGroup = new FormGroup({
    toiletPaper: new FormControl(),
    paperTowels: new FormControl(),
    dishSoap: new FormControl(),
    detergent: new FormControl(),
    sponges: new FormControl(),
    garbageBags: new FormControl(),
    handSoap: new FormControl(),
    potsPans: new FormControl(),
    cups: new FormControl(),
    silverware: new FormControl(),
    flatware: new FormControl(),
    other: new FormControl(),
    otherInput: new FormControl()
  });

  constructor() { }

  ngOnInit() {
  }

  onSubmit() {
    console.log(this.requestForm.get(['toiletPaper']).value);
  }

}
