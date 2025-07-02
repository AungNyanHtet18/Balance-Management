INSERT INTO Region (id, name) VALUES (1, 'Ayeyarwady Region');
INSERT INTO Region (id, name) VALUES (2, 'Bago Region');
INSERT INTO Region (id, name) VALUES (3, 'Chin State');
INSERT INTO Region (id, name) VALUES (4, 'Kachin State');
INSERT INTO Region (id, name) VALUES (5, 'Kayah State');
INSERT INTO Region (id, name) VALUES (6, 'Kayin State');
INSERT INTO Region (id, name) VALUES (7, 'Magway Region');
INSERT INTO Region (id, name) VALUES (8, 'Mandalay Region');
INSERT INTO Region (id, name) VALUES (9, 'Mon State');
INSERT INTO Region (id, name) VALUES (10, 'Naypyidaw Union Territory');
INSERT INTO Region (id, name) VALUES (11, 'Rakhine State');
INSERT INTO Region (id, name) VALUES (12, 'Sagaing Region');
INSERT INTO Region (id, name) VALUES (13, 'Shan State');
INSERT INTO Region (id, name) VALUES (14, 'Tanintharyi Region');
INSERT INTO Region (id, name) VALUES (15, 'Yangon Region');


INSERT INTO district (name, region_id) VALUES ('Pathein', 1);
INSERT INTO district (name, region_id) VALUES ('Hinthada', 1);
INSERT INTO district (name, region_id) VALUES ('Maubin', 1);
INSERT INTO district (name, region_id) VALUES ('Myaungmya', 1);
INSERT INTO district (name, region_id) VALUES ('Labutta', 1);
INSERT INTO district (name, region_id) VALUES ('Pyapon', 1);


INSERT INTO district (name, region_id) VALUES ('Bago', 2);
INSERT INTO district (name, region_id) VALUES ('Taungoo', 2);
INSERT INTO district (name, region_id) VALUES ('Pyay', 2);
INSERT INTO district (name, region_id) VALUES ('Tharrawaddy', 2);


INSERT INTO district (name, region_id) VALUES ('Hakha', 3);
INSERT INTO district (name, region_id) VALUES ('Falam', 3);
INSERT INTO district (name, region_id) VALUES ('Mindat', 3);

INSERT INTO district (name, region_id) VALUES ('Myitkyina', 4);
INSERT INTO district (name, region_id) VALUES ('Bhamo', 4);
INSERT INTO district (name, region_id) VALUES ('Mohnyin', 4);
INSERT INTO district (name, region_id) VALUES ('Putao', 4);


INSERT INTO district (name, region_id) VALUES ('Loikaw', 5);
INSERT INTO district (name, region_id) VALUES ('Bawlakhe', 5);
INSERT INTO district (name, region_id) VALUES ('Demoso', 5);


INSERT INTO district (name, region_id) VALUES ('Hpa-An', 6);
INSERT INTO district (name, region_id) VALUES ('Myawaddy', 6);
INSERT INTO district (name, region_id) VALUES ('Kawkareik', 6);


INSERT INTO district (name, region_id) VALUES ('Magway', 7);
INSERT INTO district (name, region_id) VALUES ('Minbu', 7);
INSERT INTO district (name, region_id) VALUES ('Pakokku', 7);
INSERT INTO district (name, region_id) VALUES ('Thayet', 7);

INSERT INTO district (name, region_id) VALUES ('Aungmyaythazan', 8);
INSERT INTO district (name, region_id) VALUES ('Chanayethazan', 8);
INSERT INTO district (name, region_id) VALUES ('Chanmyathazi', 8);
INSERT INTO district (name, region_id) VALUES ('Mahaaungmyay', 8);
INSERT INTO district (name, region_id) VALUES ('Amarapura', 8);
INSERT INTO district (name, region_id) VALUES ('Pyigyidagun', 8);
INSERT INTO district (name, region_id) VALUES ('Patheingyi', 8);
INSERT INTO district (name, region_id) VALUES ('Myingyan', 8);
INSERT INTO district (name, region_id) VALUES ('Kyaukse', 8);
INSERT INTO district (name, region_id) VALUES ('Meiktila', 8);
INSERT INTO district (name, region_id) VALUES ('Nyaung-U', 8);


INSERT INTO district (name, region_id) VALUES ('Mawlamyine', 9);
INSERT INTO district (name, region_id) VALUES ('Thaton', 9);


INSERT INTO district (name, region_id) VALUES ('Ottara District', 10);
INSERT INTO district (name, region_id) VALUES ('Dekkhina District', 10);

INSERT INTO district (name, region_id) VALUES ('Sittwe', 11);
INSERT INTO district (name, region_id) VALUES ('Kyaukpyu', 11);
INSERT INTO district (name, region_id) VALUES ('Maungdaw', 11);
INSERT INTO district (name, region_id) VALUES ('Thandwe', 11);

INSERT INTO district (name, region_id) VALUES ('Sagaing', 12);
INSERT INTO district (name, region_id) VALUES ('Shwebo', 12);
INSERT INTO district (name, region_id) VALUES ('Kale', 12);
INSERT INTO district (name, region_id) VALUES ('Monywa', 12);
INSERT INTO district (name, region_id) VALUES ('Kanbalu', 12);
INSERT INTO district (name, region_id) VALUES ('Katha', 12);
INSERT INTO district (name, region_id) VALUES ('Tamu', 12);

INSERT INTO district (name, region_id) VALUES ('Taunggyi', 13);
INSERT INTO district (name, region_id) VALUES ('Lashio', 13);
INSERT INTO district (name, region_id) VALUES ('Kengtung', 13);
INSERT INTO district (name, region_id) VALUES ('Muse', 13);
INSERT INTO district (name, region_id) VALUES ('Loilen', 13);
INSERT INTO district (name, region_id) VALUES ('Hopang', 13);
INSERT INTO district (name, region_id) VALUES ('Laukkaing', 13);
INSERT INTO district (name, region_id) VALUES ('Mong Hpayak', 13);

INSERT INTO district (name, region_id) VALUES ('Dawei', 14);
INSERT INTO district (name, region_id) VALUES ('Myeik', 14);
INSERT INTO district (name, region_id) VALUES ('Kawthaung', 14);

INSERT INTO district (name, region_id) VALUES ('North Yangon', 15);
INSERT INTO district (name, region_id) VALUES ('South Yangon', 15);
INSERT INTO district (name, region_id) VALUES ('East Yangon', 15);
INSERT INTO district (name, region_id) VALUES ('West Yangon', 15);


-- Ayeyarwady Region
INSERT INTO township (name, district_id) VALUES ('Pathein Township', 1);
INSERT INTO township (name, district_id) VALUES ('Ngapudaw Township', 1);
INSERT INTO township (name, district_id) VALUES ('Hinthada Township', 2);
INSERT INTO township (name, district_id) VALUES ('Zalun Township', 2);
INSERT INTO township (name, district_id) VALUES ('Maubin Township', 3);
INSERT INTO township (name, district_id) VALUES ('Nyaungdon Township', 3);
INSERT INTO township (name, district_id) VALUES ('Myaungmya Township', 4);
INSERT INTO township (name, district_id) VALUES ('Einme Township', 4);
INSERT INTO township (name, district_id) VALUES ('Labutta Township', 5);
INSERT INTO township (name, district_id) VALUES ('Mawlamyinegyun Township', 5);
INSERT INTO township (name, district_id) VALUES ('Pyapon Township', 6);
INSERT INTO township (name, district_id) VALUES ('Bogale Township', 6);

-- Bago Region
INSERT INTO township (name, district_id) VALUES ('Bago Township', 7);
INSERT INTO township (name, district_id) VALUES ('Nyaunglebin Township', 7);
INSERT INTO township (name, district_id) VALUES ('Taungoo Township', 8);
INSERT INTO township (name, district_id) VALUES ('Pyu Township', 8);
INSERT INTO township (name, district_id) VALUES ('Pyay Township', 9);
INSERT INTO township (name, district_id) VALUES ('Paungde Township', 9);
INSERT INTO township (name, district_id) VALUES ('Tharrawaddy Township', 10);
INSERT INTO township (name, district_id) VALUES ('Gyobingauk Township', 10);

-- Chin State
INSERT INTO township (name, district_id) VALUES ('Hakha Township', 11);
INSERT INTO township (name, district_id) VALUES ('Htantlang Township', 11);
INSERT INTO township (name, district_id) VALUES ('Falam Township', 12);
INSERT INTO township (name, district_id) VALUES ('Tiddim Township', 12);
INSERT INTO township (name, district_id) VALUES ('Mindat Township', 13);
INSERT INTO township (name, district_id) VALUES ('Kanpetlet Township', 13);

-- Kachin State
INSERT INTO township (name, district_id) VALUES ('Myitkyina Township', 14);
INSERT INTO township (name, district_id) VALUES ('Waingmaw Township', 14);
INSERT INTO township (name, district_id) VALUES ('Bhamo Township', 15);
INSERT INTO township (name, district_id) VALUES ('Shwegu Township', 15);
INSERT INTO township (name, district_id) VALUES ('Mohnyin Township', 16);
INSERT INTO township (name, district_id) VALUES ('Mogaung Township', 16);
INSERT INTO township (name, district_id) VALUES ('Putao Township', 17);
INSERT INTO township (name, district_id) VALUES ('Machanbaw Township', 17);

-- Kayah State
INSERT INTO township (name, district_id) VALUES ('Loikaw Township', 18);
INSERT INTO township (name, district_id) VALUES ('Demoso Township', 18);
INSERT INTO township (name, district_id) VALUES ('Bawlakhe Township', 19);
INSERT INTO township (name, district_id) VALUES ('Mese Township', 19);
INSERT INTO township (name, district_id) VALUES ('Hpruso Township', 20);
INSERT INTO township (name, district_id) VALUES ('Shadaw Township', 20);

-- Kayin State
INSERT INTO township (name, district_id) VALUES ('Hpa-An Township', 21);
INSERT INTO township (name, district_id) VALUES ('Hlaingbwe Township', 21);
INSERT INTO township (name, district_id) VALUES ('Myawaddy Township', 22);
INSERT INTO township (name, district_id) VALUES ('Wawlay Township', 22);
INSERT INTO township (name, district_id) VALUES ('Kawkareik Township', 23);
INSERT INTO township (name, district_id) VALUES ('Kyain Seikgyi Township', 23);

-- Magway Region
INSERT INTO township (name, district_id) VALUES ('Magway Township', 24);
INSERT INTO township (name, district_id) VALUES ('Taungdwingyi Township', 24);
INSERT INTO township (name, district_id) VALUES ('Minbu Township', 25);
INSERT INTO township (name, district_id) VALUES ('Ngape Township', 25);
INSERT INTO township (name, district_id) VALUES ('Pakokku Township', 26);
INSERT INTO township (name, district_id) VALUES ('Pauk Township', 26);
INSERT INTO township (name, district_id) VALUES ('Thayet Township', 27);
INSERT INTO township (name, district_id) VALUES ('Aunglan Township', 27);

-- Mandalay Region
INSERT INTO township (name, district_id) VALUES ('Aungmyaythazan Township', 28);
INSERT INTO township (name, district_id) VALUES ('Chanayethazan Township', 29);
INSERT INTO township (name, district_id) VALUES ('Chanmyathazi Township', 30);
INSERT INTO township (name, district_id) VALUES ('Mahaaungmyay Township', 31);
INSERT INTO township (name, district_id) VALUES ('Amarapura Township', 32);
INSERT INTO township (name, district_id) VALUES ('Pyigyidagun Township', 33);
INSERT INTO township (name, district_id) VALUES ('Patheingyi Township', 34);
INSERT INTO township (name, district_id) VALUES ('Myingyan Township', 35);
INSERT INTO township (name, district_id) VALUES ('Kyaukse Township', 36);
INSERT INTO township (name, district_id) VALUES ('Meiktila Township', 37);
INSERT INTO township (name, district_id) VALUES ('Nyaung-U Township', 38);

-- Mon State
INSERT INTO township (name, district_id) VALUES ('Mawlamyine Township', 39);
INSERT INTO township (name, district_id) VALUES ('Mudon Township', 39);
INSERT INTO township (name, district_id) VALUES ('Thaton Township', 40);
INSERT INTO township (name, district_id) VALUES ('Paung Township', 40);

-- Naypyidaw Union Territory
INSERT INTO township (name, district_id) VALUES ('Ottara Thiri Township', 41);
INSERT INTO township (name, district_id) VALUES ('Pobbathiri Township', 41);

INSERT INTO township (name, district_id) VALUES ('Dekkhina Thiri Township', 42);


INSERT INTO township (name, district_id) VALUES ('Sittwe', 43);
INSERT INTO township (name, district_id) VALUES ('Pauktaw', 43);
INSERT INTO township (name, district_id) VALUES ('Myebon', 43);
INSERT INTO township (name, district_id) VALUES ('Mrauk-U', 43);

INSERT INTO township (name, district_id) VALUES ('Kyaukpyu', 44);
INSERT INTO township (name, district_id) VALUES ('Manaung', 44);
INSERT INTO township (name, district_id) VALUES ('Ramree', 44);

INSERT INTO township (name, district_id) VALUES ('Maungdaw', 45);
INSERT INTO township (name, district_id) VALUES ('Buthidaung', 45);

INSERT INTO township (name, district_id) VALUES ('Thandwe', 46);
INSERT INTO township (name, district_id) VALUES ('Gwa', 46);
INSERT INTO township (name, district_id) VALUES ('Toungup', 46);

INSERT INTO township (name, district_id) VALUES ('Sagaing', 47);
INSERT INTO township (name, district_id) VALUES ('Myinmu', 47);
INSERT INTO township (name, district_id) VALUES ('Myaung', 47);

INSERT INTO township (name, district_id) VALUES ('Shwebo', 48);
INSERT INTO township (name, district_id) VALUES ('Wetlet', 48);
INSERT INTO township (name, district_id) VALUES ('Khin-U', 48);

INSERT INTO township (name, district_id) VALUES ('Kale', 49);
INSERT INTO township (name, district_id) VALUES ('Kalewa', 49);
INSERT INTO township (name, district_id) VALUES ('Mingin', 49);

INSERT INTO township (name, district_id) VALUES ('Monywa', 50);
INSERT INTO township (name, district_id) VALUES ('Budalin', 50);
INSERT INTO township (name, district_id) VALUES ('Chaung-U', 50);

INSERT INTO township (name, district_id) VALUES ('Kanbalu', 51);
INSERT INTO township (name, district_id) VALUES ('Ye-U', 51);

INSERT INTO township (name, district_id) VALUES ('Katha', 52);
INSERT INTO township (name, district_id) VALUES ('Indaw', 52);

INSERT INTO township (name, district_id) VALUES ('Tamu', 53);

INSERT INTO township (name, district_id) VALUES ('Taunggyi', 54);
INSERT INTO township (name, district_id) VALUES ('Kalaw', 54);
INSERT INTO township (name, district_id) VALUES ('Nyaungshwe', 54);

INSERT INTO township (name, district_id) VALUES ('Lashio', 55);
INSERT INTO township (name, district_id) VALUES ('Hseni', 55);
INSERT INTO township (name, district_id) VALUES ('Namtu', 55);

INSERT INTO township (name, district_id) VALUES ('Kengtung', 56);
INSERT INTO township (name, district_id) VALUES ('Mongping', 56);

INSERT INTO township (name, district_id) VALUES ('Muse', 57);
INSERT INTO township (name, district_id) VALUES ('Kutkai', 57);

INSERT INTO township (name, district_id) VALUES ('Loilen', 58);
INSERT INTO township (name, district_id) VALUES ('Laukkaing', 58);

INSERT INTO township (name, district_id) VALUES ('Hopang', 59);

INSERT INTO township (name, district_id) VALUES ('Laukkaing', 60);

INSERT INTO township (name, district_id) VALUES ('Mong Hpayak', 61);

INSERT INTO township (name, district_id) VALUES ('Dawei', 62);
INSERT INTO township (name, district_id) VALUES ('Thayetchaung', 62);

INSERT INTO township (name, district_id) VALUES ('Myeik', 63);
INSERT INTO township (name, district_id) VALUES ('Tanintharyi', 63);

INSERT INTO township (name, district_id) VALUES ('Kawthaung', 64);
INSERT INTO township (name, district_id) VALUES ('Bokpyin', 64);

INSERT INTO township (name, district_id) VALUES ('Insein', 65);
INSERT INTO township (name, district_id) VALUES ('Hlaing', 65);
INSERT INTO township (name, district_id) VALUES ('Mingaladon', 65);

INSERT INTO township (name, district_id) VALUES ('Thanlyin', 66);
INSERT INTO township (name, district_id) VALUES ('Dala', 66);

INSERT INTO township (name, district_id) VALUES ('Thingangyun', 67);
INSERT INTO township (name, district_id) VALUES ('Tamwe', 67);

INSERT INTO township (name, district_id) VALUES ('Ahlone', 68);
INSERT INTO township (name, district_id) VALUES ('Kyimyindaing', 68);
