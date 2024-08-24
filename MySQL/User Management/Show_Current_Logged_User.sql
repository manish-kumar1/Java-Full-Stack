
-- Show Current Logged User

SELECT user, host, db, command FROM information_schema.processlist;