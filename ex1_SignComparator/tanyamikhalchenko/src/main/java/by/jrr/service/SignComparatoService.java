package by.jrr.service;

import by.jrr.bean.SignComparato;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SignComparatoService {

    private Logger logger = LoggerFactory.getLogger(SignComparatoService.class);
        public SignComparatoService() {
// no args constructor
    }

        public String determineTheSign(SignComparato signComparato) {
            logger.info("Determining where the number belongs");
            if (signComparato.getNumber() > 0) {
                return "Number is positive";
            } else if (signComparato.getNumber() < 0) {
              return "Number is negative";
            } else {
                return "Number is equal to zero";
            }

        }
    }

