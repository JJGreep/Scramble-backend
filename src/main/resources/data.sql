INSERT INTO scrambledb.public.eat_group ("id", "name")
VALUES  ( 1001, 'Javaanse Strijders'),
        ( 200, 'Roffa Hooligans'),
        ( 300, 'Echte Hagenezen'),
        ( 400, 'Saaie Mensen'),
        ( 500, 'Lawaai is saai'),
        ( 600, 'Cousins Across the Pond'),
        ( 700, 'Without Borders'),
        ( 800, 'Worldwide Wolfpack'),
        ( 900, 'Across Borders'),
        ( 1000, 'Quality Screen Time'),
        ( 1100, 'Connect the Dots'),
        ( 1200, 'Wired'),
        ( 1300, 'Wireless'),
        ( 1400, 'Strong Signals'),
        ( 1500, 'Baddies and Buddies'),
        ( 1600, 'Across the Sea'),
        ( 1700, 'Across Borders'),
        ( 1800, 'Family Matters'),
        ( 1900, 'No Nonsense'),
        ( 2000, 'Public Square'),
        ( 2100, 'Virtual Family'),
        ( 2200, 'All in the Mind'),
        ( 2300, 'Gift for Gab'),
        ( 2400, 'Brothers From Another Mother'),
        ( 2500, 'Sistas from Different Mistas'),
        ( 2600, 'Brotherly Harmony');

INSERT INTO scrambledb.public.account ("id", "email", "password", "user_name")
VALUES ( 1, 'test@test.com','******','tester');
INSERT INTO scrambledb.public.account_eat_group ("account_id", "eat_group_id")
VALUES ( 1,1000 );