import { TestBed } from '@angular/core/testing';

import { AuthgradService } from './authgrad.service';

describe('AuthgradService', () => {
  let service: AuthgradService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(AuthgradService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
