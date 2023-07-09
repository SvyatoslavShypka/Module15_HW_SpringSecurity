-- Create the customers table
CREATE TABLE user_account (
  id BIGINT AUTO_INCREMENT PRIMARY KEY,
  username VARCHAR(50),
  password VARCHAR(255),
  is_account_non_expired BOOLEAN,
  is_account_non_locked BOOLEAN,
  is_credentials_non_expired BOOLEAN,
  is_enabled BOOLEAN,
  authorities TEXT
);