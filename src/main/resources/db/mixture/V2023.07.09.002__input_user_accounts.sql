-- Create user_account's table
INSERT INTO user_account
(id,
 username,
 password,
 is_account_non_expired,
 is_account_non_locked,
 is_credentials_non_expired,
 is_enabled,
 authorities)
VALUES
  (DEFAULT,
   'test1@gmail.com',
   '$2a$10$QWlgG.OD2HYU.qv49oe/N.vAmWtFSoxuL1qTG1pCVF3WWIMBnQ7WG',
   true,
   true,
   true,
   true,
   'USER,SUPER_ADMIN'),

    (DEFAULT,
   'test2@gmail.com',
   '$2a$10$QWlgG.OD2HYU.qv49oe/N.vAmWtFSoxuL1qTG1pCVF3WWIMBnQ7WG',
   true,
   true,
   true,
   true,
   'USER,SUPER_ADMIN')
;
