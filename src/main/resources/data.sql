INSERT INTO place (place_id, name, category, detail_address, distance, description, address, stars, visitor_review,
                   blog_review, direction, close_time, number, characters, sns, detail)
VALUES (1, '알고', '스파게티, 파스타전문', '서울 광진구 광나루로 17길 10', '935m', '수제맥주와 소세지가 맛있는 곳', '서울 광진구', '4.82', 295,
        321, '어린이대공원역 5번 출구에서 187m', '22:00', '02-3409-2645', '무선 인터넷, 주차, 포장, 배달, 반려동물 동반, 예약',
        'https://www.instagram.com/algo_taphouse.',
        '안녕하세요 부담없는 가격과 맛있는 맛으로 여러분께 다가가는 파스타 및 맥주 전문점 알고입니다. 편안한 한 끼 식사, 편안한 한 잔의 맥주로 여러분의 하루에 즐거움을 더해드리겠습니다.');

INSERT INTO place (place_id, name, category, detail_address, distance, description, address, stars, visitor_review,
                   blog_review, direction, close_time, number, characters, sns, detail)
VALUES (2, '알고리즘', '퓨전음식', '서울 강남구 도산대로49길 8 2층', '31km', '미쉐린 가이드 서울 2023', '서울 강남구', '4.75', 13,
        38, '압구정로데오역 5번 출구에서 577m', '18:30', '010-3015-3869', '발렛파킹, 예약',
        'https://www.instagram.com/aelgerizm',
        '미쉐린 가이드 서울 2023 NEW 새로운 미쉐린 맛집에서 특별함을 만나보세요. 재패니스 프렌치 알고리즘 입니다.');

INSERT INTO place (place_id, name, category, detail_address, distance, description, address, stars, visitor_review,
                   blog_review, direction, close_time, number, characters, sns, detail)
VALUES (3, '알고', '경영컨설팅', '서울 강남구 테헤란로87길 21 동성빌딩 11', '3.6km', '삼성동코워킹스페이스', '서울 강남구 삼성동', '', 1,
        0, '삼성역 5번 출구에서 438m', '18:00', '0507-1316-6110', '예약, 단체 이용 가능, 무선 인터넷, 남/녀 화장실 구분, 주차',
        'http://www.rgospace.com',
        '');

INSERT INTO place (place_id, name, category, detail_address, distance, description, address, stars, visitor_review,
                   blog_review, direction, close_time, number, characters, sns, detail)
VALUES (4, '알고리고', '소프트웨어개발', '서울 강남구 봉은사로 319 내외빌딩 4층', '4.3km', '', '서울 강남구', '', 1,
        2, '선정릉역 1번 출구에서 127m', '18:00', '02-546-0190', '스마트 체어, 스마트 의자, 공부의자, 스마트 방석, 미래형 자동차',
        'https://www.instagram.com/algostudy_official',
        '');

INSERT INTO place (place_id, name, category, detail_address, distance, description, address, stars, visitor_review,
                   blog_review, direction, close_time, number, characters, sns, detail)
VALUES (5, '알고파토이', '장난감', '서울 강동구 천호대로151길 19 2층', '4.4Km', '', '서울 강동구', '4.53', 467,
        0, '천호역 2번 출구에서 142m', '', '070-7799-0805', '제로페이',
        'https://www.instagram.com/algopa_toy',
        '빠르고 강하게, 오리지널 굿즈를 만듭니다.');

INSERT INTO place (place_id, name, category, detail_address, distance, description, address, stars, visitor_review,
                   blog_review, direction, close_time, number, characters, sns, detail)
VALUES (6, '알고랩', '퀵서비스', '서울 강남구 봉은사로 331 9층', '6.6km', '', '서울 강남구', '', 0,
        0, '선정릉역 1번 출구에서 21m', '', '1666-0101', '퀵서비스, 퀵배송, 퀵서비스요금',
        'https://blog.naver.com/algoquick',
        '기업물류 전문 알고퀵(AlogQuick)입니다. http://algoquick.com에서 2천만개의 DB를 바탕으로 산출되는 퀵서비스요금을 확인하고 편리하게 접수하세요.');

INSERT INTO place (place_id, name, category, detail_address, distance, description, address, stars, visitor_review,
                   blog_review, direction, close_time, number, characters, sns, detail)
VALUES (7, '알고리마', '기업', '서울 강남구 영동대로 342 3층', '3.9km', '', '서울 강남구', '', 0,
        0, '삼성역 2번 출구에서 413m', '', '070-4354-7176', '',
        '',
        '');

INSERT INTO place (place_id, name, category, detail_address, distance, description, address, stars, visitor_review,
                   blog_review, direction, close_time, number, characters, sns, detail)
VALUES (8, '알고케어', '소프트웨어개발', '서울 중구 마른내로 47 6층', '7.5km', '', '서울 중구', '', 0,
        1, '을지로3가역 8번 출구에서 101m', '', '02-1666-9601', '헬스케어 인공지능, 영양관리 솔루션, 기업건강 복지',
        '',
        '알고케어는 헬스케어 인공지능 기반 1:1 개인맞춤 건강관리 솔루션을 서비스하는 디지털 헬스케어 기업입니다.');

INSERT INTO direction (place_id, route)
VALUES (1, "https://sopt-seminar.s3.ap-northeast-2.amazonaws.com/direction/result_first.png");

INSERT INTO direction (place_id, route)
VALUES (1, "https://sopt-seminar.s3.ap-northeast-2.amazonaws.com/direction/reult_second.png");

INSERT INTO direction (place_id, route)
VALUES (1, "https://sopt-seminar.s3.ap-northeast-2.amazonaws.com/direction/result_last.png");


INSERT INTO preview (place_id, preview_img_url)
VALUES (1, "https://sopt-seminar.s3.ap-northeast-2.amazonaws.com/img_preview_1.png");

INSERT INTO preview (place_id, preview_img_url)
VALUES (1, "https://sopt-seminar.s3.ap-northeast-2.amazonaws.com/img_preview_2.png");

INSERT INTO preview (place_id, preview_img_url)
VALUES (1, "https://sopt-seminar.s3.ap-northeast-2.amazonaws.com/img_preview_3.png");


INSERT INTO menu(place_id, menu_name, menu_price, menu_img_url)
VALUES (1, "투움바 파스타", 10900, "https://sopt-seminar.s3.ap-northeast-2.amazonaws.com/img_menu_1.png");

INSERT INTO menu(place_id, menu_name, menu_price, menu_img_url)
VALUES (1, "김치 베이컨 필라프", 10900, "https://sopt-seminar.s3.ap-northeast-2.amazonaws.com/img_menu_2.png");

INSERT INTO menu(place_id, menu_name, menu_price, menu_img_url)
VALUES (1, "샐러드", 10900, "https://sopt-seminar.s3.ap-northeast-2.amazonaws.com/img_menu_3.png");

INSERT INTO menu(place_id, menu_name, menu_price, menu_img_url)
VALUES (1, "까르보나라", 10900, "https://sopt-seminar.s3.ap-northeast-2.amazonaws.com/img_menu_4.png");

INSERT INTO visitor_review(place_id, visitor_review_author, visitor_review_content,
                           visitor_review_author_thumbnail, visitor_review_img_url)
VALUES (1, "또치288", "로제 파스타 꾸덕하고 찐해서 진짜 맛있었어요! 봉골레도 간이 잘돼서 맛있게 먹고 왔어요! ㅎ",
        "https://sopt-seminar.s3.ap-northeast-2.amazonaws.com/thumbnail_1.png",
        "https://sopt-seminar.s3.ap-northeast-2.amazonaws.com/img_visit_review_1.png");

INSERT INTO visitor_review(place_id, visitor_review_author, visitor_review_content,
                           visitor_review_author_thumbnail, visitor_review_img_url)
VALUES (1, "또치288", "로제 파스타 꾸덕하고 찐해서 진짜 맛있었어요! 봉골레도 간이 잘돼서 맛있게 먹고 왔어요! ㅎㅎ",
        "https://sopt-seminar.s3.ap-northeast-2.amazonaws.com/thumbnail_2.png",
        "https://sopt-seminar.s3.ap-northeast-2.amazonaws.com/img_visit_review_2.png");

INSERT INTO visitor_review(place_id, visitor_review_author, visitor_review_content,
                           visitor_review_author_thumbnail, visitor_review_img_url)
VALUES (1, "또치288", "로제 파스타 꾸덕하고 찐해서 진짜 맛있었어요! 봉골레도 간이 잘돼서 맛있게 먹고 왔어요! ㅎㅎㅎ",
        "https://sopt-seminar.s3.ap-northeast-2.amazonaws.com/thumbnail_3.png",
        "https://sopt-seminar.s3.ap-northeast-2.amazonaws.com/img_visit_review_3.png");

INSERT INTO blog_review(place_id, blog_review_author, blog_review_title,
                        blog_review_content,
                        blog_review_author_thumbnail,
                        blog_review_img_url)
VALUES (1, "또치288", "[어린이대공원/세종대] 파스타 맛집 ''알고'' → 후식은 ''와플칸'' 조져!!",
        "월요일이었다. 왜 살아야 하나 이유가 필요했던 하루. 이런 기분이 들 땐, 효과...",
        "https://sopt-seminar.s3.ap-northeast-2.amazonaws.com/thumbnail_4.png",
        "https://sopt-seminar.s3.ap-northeast-2.amazonaws.com/img_blog_review_1.png");

INSERT INTO blog_review(place_id, blog_review_author, blog_review_title,
                        blog_review_content,
                        blog_review_author_thumbnail,
                        blog_review_img_url)
VALUES (2, "또치288", "[어린이대공원/세종대] 파스타 맛집 ''알고'' → 후식은 ''와플칸'' 조져!!",
        "월요일이었다. 왜 살아야 하나 이유가 필요했던 하루. 이런 기분이 들 땐, 효과...",
        "https://sopt-seminar.s3.ap-northeast-2.amazonaws.com/thumbnail_5.png",
        "https://sopt-seminar.s3.ap-northeast-2.amazonaws.com/img_blog_review_2.png");

INSERT INTO blog_review(place_id, blog_review_author, blog_review_title,
                        blog_review_content,
                        blog_review_author_thumbnail,
                        blog_review_img_url)
VALUES (1, "또치288", "[어린이대공원/세종대] 파스타 맛집 ''알고'' → 후식은 ''와플칸'' 조져!!",
        "월요일이었다. 왜 살아야 하나 이유가 필요했던 하루. 이런 기분이 들 땐, 효과...",
        "https://sopt-seminar.s3.ap-northeast-2.amazonaws.com/thumbnail_6.png",
        "https://sopt-seminar.s3.ap-northeast-2.amazonaws.com/img_blog_review_3.png");
