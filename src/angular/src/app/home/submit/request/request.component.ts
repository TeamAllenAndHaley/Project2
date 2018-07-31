import { Component, OnInit } from '@angular/core';
import { FormGroup, FormControl } from '@angular/forms';
import { RequestService } from '../../../service/request.service';

@Component({
  selector: 'app-request',
  templateUrl: './request.component.html',
  styleUrls: ['./request.component.css']
})
export class RequestComponent implements OnInit {
  formData: any = {};
  other: string;

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

  constructor(private requestService: RequestService) { }

  ngOnInit() {
  }

  onSubmit() {
    this.requestService.createRequest(
      this.requestForm.get(['toiletPaper']).value,
      this.requestForm.get(['paperTowels']).value,
      this.requestForm.get(['dishSoap']).value,
      this.requestForm.get(['detergent']).value,
      this.requestForm.get(['sponges']).value,
      this.requestForm.get(['garbageBags']).value,
      this.requestForm.get(['handSoap']).value,
      this.requestForm.get(['potsPans']).value,
      this.requestForm.get(['cups']).value,
      this.requestForm.get(['silverware']).value,
      this.requestForm.get(['flatware']).value,
      this.requestForm.get(['otherInput']).value,
      JSON.parse(localStorage.getItem('userLoggedIn')).empId
    );
  }

}
