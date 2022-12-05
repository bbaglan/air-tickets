import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { MatPaginator } from '@angular/material/paginator';
import { MatTableDataSource } from '@angular/material/table';
import { of } from 'rxjs';
import { delay, map } from 'rxjs/operators';

@Injectable({
  providedIn: 'root'
})
export class DataService {

  constructor(private http : HttpClient) { }

  getUserData(){
    
    return of([
      {
        "id": 1,
        "name": "Agzhan Shauyenov",
        "gender": "Male",
        "username": "SkyNet",
        "email": "akzhan133@gmail.com",
        "address": {
          "street": "Raimbek",
          "suite": "dom. 243",
          "city": "Almaty",
          "zipcode": "000500",
          "geo": {
            "lat": "-37.3159",
            "lng": "81.1496"
          }
        },
        "phone": "+7-771-145-1309",
        "website": "vk.ru",
        "company": {
          "name": "League",
          "catchPhrase": "Multi-layered client-server neural-net",
          "bs": "harness real-time e-markets"
        }
      },
      {
        "id": 2,
        "name": "Bexultan Kubekbay",
        "gender": "Male",
        "username": "Bex",
        "email": "bexkum@gmail.com",
        "address": {
          "street": "Car city",
          "suite": "dom. 203",
          "city": "Almaty",
          "zipcode": "90566-7771",
          "geo": {
            "lat": "-43.9509",
            "lng": "-34.4618"
          }
        },
        "phone": "010-692-6593 x09125",
        "website": "anastasia.net",
        "company": {
          "name": "Deckow-Crist",
          "catchPhrase": "Proactive didactic contingency",
          "bs": "synergize scalable supply-chains"
        }
      },
      {
        "id": 3,
        "name": "Damir Agadilov",
        "gender": "Male",
        "username": "Damir",
        "email": "damiragadil@gmail.com",
        "address": {
          "street": "Tastak",
          "suite": "unknown",
          "city": "Almaty",
          "zipcode": "000500",
          "geo": {
            "lat": "-68.6102",
            "lng": "-47.0653"
          }
        },
        "phone": "+7-702-132-4363",
        "website": "vk.ru",
        "company": {
          "name": "Zhuldiz forever",
          "catchPhrase": "Face to face bifurcated interface",
          "bs": "e-enable strategic applications"
        }
      },
      {
        "id": 4,
        "name": "Baglan Abitali",
        "gender": "Female",
        "username": "Baha",
        "email": "baglan@gmail.com",
        "address": {
          "street": "unknown",
          "suite": "unknown",
          "city": "Talgar",
          "zipcode": "000500",
          "geo": {
            "lat": "29.4572",
            "lng": "-164.2990"
          }
        },
        "phone": "+7-747-897-1968",
        "website": "vk.ru",
        "company": {
          "name": "Baha Group",
          "catchPhrase": "Multi-tiered zero tolerance productivity",
          "bs": "transition cutting-edge web services"
        }
      },
      {
        "id": 5,
        "name": "Asem Tulegenova",
        "gender": "Female",
        "username": "Asema",
        "email": "asem@gmail.com",
        "address": {
          "street": "Tole bi",
          "suite": "unknown",
          "city": "Almaty",
          "zipcode": "005500",
          "geo": {
            "lat": "-31.8129",
            "lng": "62.5342"
          }
        },
        "phone": "+7-747-994-7038",
        "website": "vk.ru",
        "company": {
          "name": "Asema LLC",
          "catchPhrase": "User-centric fault-tolerant solution",
          "bs": "revolutionize end-to-end systems"
        }
      },
      {
        "id": 6,
        "name": "Duman Bizhanov",
        "gender": "Male",
        "username": "Duman Bizhanov",
        "email": "dumeke@gmail.com",
        "address": {
          "street": "unknown",
          "suite": "unknown",
          "city": "Kaskelen",
          "zipcode": "000500",
          "geo": {
            "lat": "-71.4197",
            "lng": "71.7478"
          }
        },
        "phone": "+7-700-022-8808",
        "website": "vk.ru",
        "company": {
          "name": "Dumeke Group",
          "catchPhrase": "Synchronised bottom-line interface",
          "bs": "e-enable innovative applications"
        }
      },
      {
        "id": 7,
        "name": "Erzhigit Turar",
        "gender": "Male",
        "username": "Erzhigit",
        "email": "erzhigit@gmail.com",
        "address": {
          "street": "unknown",
          "suite": "unknown",
          "city": "Taraz",
          "zipcode": "000500",
          "geo": {
            "lat": "24.8918",
            "lng": "21.8984"
          }
        },
        "phone": "210.067.6132",
        "website": "vk.ru",
        "company": {
          "name": "Erzh Group",
          "catchPhrase": "Configurable multimedia task-force",
          "bs": "generate enterprise e-tailers"
        }
      },
      {
        "id": 8,
        "name": "Ganiev Meirambek",
        "gender": "Male",
        "username": "Boss of the GYM",
        "email": "meira@gmail.com",
        "address": {
          "street": "Kalkaman",
          "suite": "unknown",
          "city": "Almaty",
          "zipcode": "000500",
          "geo": {
            "lat": "-14.3990",
            "lng": "-120.7677"
          }
        },
        "phone": "+7-778-509-5049",
        "website": "vk.ru",
        "company": {
          "name": "Gachi Community",
          "catchPhrase": "Implemented secondary concept",
          "bs": "e-enable extensible e-tailers"
        }
      },
      {
        "id": 9,
        "name": "Damir Zhumabekov",
        "gender": "Male",
        "username": "Eminem",
        "email": "damirZhum@gmail.com",
        "address": {
          "street": "unknown",
          "suite": "unknown",
          "city": "Alakol",
          "zipcode": "000500",
          "geo": {
            "lat": "24.6463",
            "lng": "-168.8889"
          }
        },
        "phone": "+7-747-646-2196",
        "website": "vk.ru",
        "company": {
          "name": "Eminem and Korona",
          "catchPhrase": "Switchable contextually-based project",
          "bs": "aggregate real-time technologies"
        }
      },
      {
        "id": 10,
        "name": "Abay Doskeldinov",
        "gender": "Male",
        "username": "abaywolf",
        "email": "abaywolf@mail.ru",
        "address": {
          "street": "unknown",
          "suite": "unknown",
          "city": "Kaskelen",
          "zipcode": "000500",
          "geo": {
            "lat": "-38.2386",
            "lng": "57.2232"
          }
        },
        "phone": "+7-708-323-4977",
        "website": "vk.ru",
        "company": {
          "name": "AbayWolf LLC",
          "catchPhrase": "Centralized empowering task-force",
          "bs": "target end-to-end models"
        }
      }
    ]).pipe ( delay( 1000 ) );
  }

}
