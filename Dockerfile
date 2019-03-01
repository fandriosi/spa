FROM airhacks/glassfish
COPY ./target/spa.war ${DEPLOYMENT_DIR}
