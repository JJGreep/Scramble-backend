INSERT INTO scrambledb.public.eat_group ("id", "name")
VALUES ( 1, 'Test');
INSERT INTO scrambledb.public.account ("id", "email", "password", "user_name")
VALUES ( 1, 'test@test.com','******','tester');
INSERT INTO scrambledb.public.account_eat_group ("account_id", "eat_group_id")
VALUES ( 1,1 );
