/*
 * serial_errors.h
 *
 *  Created on: Jan 27, 2017
 *      Author: victorhantelmann
 */

#ifndef SERIAL_ERRORS_H_
#define SERIAL_ERRORS_H_

#include "serial_constants.h"

class serial_error {
  public:
    serial_error();
    serial_error(std::string iError);
    ~serial_error();
    void set(std::string inStr);
    std::string what();
  private:
    std::string error;
};

serial_error::serial_error () {
    serial_error::error = NO_ERROR;
}
serial_error::serial_error (std::string iError) {
    serial_error::error = iError;
}
serial_error::~serial_error() {}

void serial_error::set(std::string inStr) {
    serial_error::error = inStr;
}
std::string serial_error::what() {
    return ((serial_error::error.compare(NO_ERROR) == 0) ? NO_ERROR : error);
}

serial_error err_empty_name = serial_error(ERR_EMPTY_NAME);
serial_error err_wrong_name = serial_error(ERR_WRONG_NAME);
serial_error err_baud_rate = serial_error(ERR_BAUD);
serial_error err_baud_rate_not_set = serial_error(ERR_BAUD_NOT_SET);
serial_error err_data_bits = serial_error(ERR_DATA_BITS);
serial_error err_data_bits_not_set = serial_error(ERR_DATA_BITS_NOT_SET);
serial_error err_parity = serial_error(ERR_PARITY);
serial_error err_parity_not_set = serial_error(ERR_PARITY_NOT_SET);
serial_error err_parity_empty_string = serial_error(ERR_PARITY_EMPTY_STRING);
serial_error err_stop_bits = serial_error(ERR_STOP_BITS);
serial_error err_stop_bits_not_set = serial_error(ERR_STOP_BITS_NOT_SET);
serial_error err_stop_bits_empty_string = serial_error(ERR_STOP_BITS_EMPTY_STRING);
serial_error ok = serial_error(NO_ERROR);

#endif /* SERIAL_ERRORS_H_ */
