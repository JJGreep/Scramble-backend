INSERT INTO scrambledb.public.eat_group ("id", "name")
VALUES  ( 1, 'Javaanse Strijders'),
        ( 2, 'Roffa Hooligans'),
        ( 3, 'Echte Hagenezen'),
        ( 4, 'Saaie Mensen'),
        ( 5, 'Lawaai is saai'),
        ( 6, 'Cousins Across the Pond'),
        ( 7, 'Without Borders'),
        ( 8, 'Worldwide Wolfpack'),
        ( 9, 'Across Borders'),
        ( 10, 'Quality Screen Time'),
        ( 11, 'Connect the Dots'),
        ( 12, 'Wired'),
        ( 13, 'Wireless'),
        ( 14, 'Strong Signals'),
        ( 15, 'Baddies and Buddies'),
        ( 16, 'Across the Sea'),
        ( 17, 'Across Borders'),
        ( 18, 'Family Matters'),
        ( 19, 'No Nonsense'),
        ( 20, 'Public Square'),
        ( 21, 'Virtual Family'),
        ( 22, 'All in the Mind'),
        ( 23, 'Gift for Gab'),
        ( 24, 'Brothers From Another Mother'),
        ( 25, 'Sistas from Different Mistas'),
        ( 26, 'Brotherly Harmony');

INSERT INTO scrambledb.public.account ("id", "email", "password", "user_name")
VALUES ( 1, 'test@test.com','******','tester');
INSERT INTO scrambledb.public.account_eat_group ("account_id", "eat_group_id")
VALUES ( 1,1 );