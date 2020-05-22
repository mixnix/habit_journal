import {useField} from "formik";
import React from "react";
import {FormGroup, Input, Label} from 'reactstrap';

const MyTextInput = ({ label, ...props }) => {
    // useField() returns [formik.getFieldProps(), formik.getFieldMeta()]
    // which we can spread on <input> and alse replace ErrorMessage entirely.
    const [field, meta] = useField(props);
    return (
        <FormGroup>
            <Label htmlFor={props.id || props.name}>{label}</Label>
            <Input className="text-input" {...field} {...props} />
            {meta.touched && meta.error ? (
                <div className="error">{meta.error}</div>
            ) : null}
        </FormGroup>
    );
};

export default MyTextInput;