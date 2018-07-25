import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { HrRepComponent } from './hr-rep.component';

describe('HrRepComponent', () => {
  let component: HrRepComponent;
  let fixture: ComponentFixture<HrRepComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ HrRepComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(HrRepComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
