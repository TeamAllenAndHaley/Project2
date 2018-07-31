import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";

@Injectable({
  providedIn: 'root'
})
export class RequestService {

  constructor(private httpClient: HttpClient) { }

  submit(toiletPaper: boolean, paperTowels: boolean, dishSoap: boolean, detergent: boolean, sponges: boolean, garbageBags: boolean,
         handSoap: boolean, potsPans: boolean, cups: boolean, silverware: boolean, flatware: boolean,
         other: string, empId: number) {
    let url = '/api/requests/add';

    return this.httpClient.post(url, {
      tp: toiletPaper,
      paperTowels: paperTowels,
      dishSoap: dishSoap,
      dishwasherSoap: detergent,
      sponge: sponges,
      garbageBag: garbageBags,
      handSoap: handSoap,
      potsPans: potsPans,
      cups: cups,
      silverware: silverware,
      flatware: flatware,
      other: other,
      empId: empId
    }).subscribe(res => console.log(res));
  }

  getByEmp(empId: number) {
    let url = '/api/requests/view'

    return this.httpClient.get<Request[]>(url)
      .subscribe(res => {
        res.forEach(res => {
          //update method, (use callback?) so that this array can update the view for a certain employee
          console.log(res);
        });
      });
  }

  getAll() {
    let url = '/api/requests/all';

    return this.httpClient.get<Request[]>(url)
      .subscribe(res => {
        res.forEach(
          res => {
            //update view with information from array of requests
            console.log(res);
          });
      });
  }
}

class Request {
  toiletPaper: boolean;
  paperTowels: boolean;
  dishSoap: boolean;
  detergent: boolean;
  sponges: boolean;
  garbageBags: boolean;
  handSoap: boolean;
  potsPans: boolean;
  cups: boolean;
  silverware: boolean;
  flatware: boolean;
  other: string;
  empId: number;

  constructor(toiletPaper: boolean, paperTowels: boolean, dishSoap: boolean, detergent: boolean, sponges: boolean, garbageBags: boolean,
              handSoap: boolean, potsPans: boolean, cups: boolean, silverware: boolean, flatware: boolean,
              other: string, empId: number) {
    this.toiletPaper = toiletPaper;
    this.paperTowels = paperTowels;
    this.dishSoap = dishSoap;
    this.detergent = detergent;
    this.sponges = sponges;
    this.garbageBags = garbageBags;
    this.handSoap = handSoap;
    this.potsPans = potsPans;
    this.cups = cups;
    this.silverware = silverware;
    this.flatware = flatware;
    this.other = other;
    this.empId = empId;
  }
}
