import { TestBed, inject } from '@angular/core/testing';

import { AuthUnguardService } from './auth-unguard.service';

describe('AuthUnguardService', () => {
  beforeEach(() => {
    TestBed.configureTestingModule({
      providers: [AuthUnguardService]
    });
  });

  it('should be created', inject([AuthUnguardService], (service: AuthUnguardService) => {
    expect(service).toBeTruthy();
  }));
});
