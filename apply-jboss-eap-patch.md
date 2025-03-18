# To apply the latest patches or updates to JBoss EAP 8.0.4, follow these steps:

## 1. Download the Latest Patch

## 2. Backup Your Installation
Before applying any patch, back up your current installation:
  - cp -r $JBOSS_HOME $JBOSS_HOME-backup

## 3. Stop the Server
Shut down any running instances:

    - $JBOSS_HOME/bin/jboss-cli.sh --connect command=:shutdown

## 4. Apply the Patch
Extract the patch ZIP file to a temporary location:

    - unzip jboss-eap-8.0.4-patch.zip -d /tmp/jboss-patch

Apply the patch using the jboss-cli.sh:

    - $JBOSS_HOME/bin/jboss-cli.sh --connect --command="patch apply /tmp/jboss-patch/jboss-eap-8.0.4-patch.zip"

## 5. Verify the Patch
Check the applied patches:

    - $JBOSS_HOME/bin/jboss-cli.sh --connect --command="patch info"

## 6. Restart the Server
Restart JBoss EAP to apply the patch:

    - $JBOSS_HOME/bin/standalone.sh
    - or
    - $JBOSS_HOME/bin/domain.sh

## 7. Test Your Application
Verify that your application works as expected and that the server logs show no errors related to the update.








