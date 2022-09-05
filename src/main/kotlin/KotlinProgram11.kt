import mu.KotlinLogging
private val logger = KotlinLogging.logger {}

fun main(){
    logger.trace {"this trace is log"}
    logger.debug {"this trace is debug"}
    logger.info {"this trace is info"}
    logger.warn {"this trace is warn"}
    logger.error {"this trace is error"}
}
