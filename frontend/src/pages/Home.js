import React from "react";
import { Formik, Form, useField } from "formik";
import * as Yup from "yup";

const MyTextInput = ({ label, ...props }) => {
    // useField() returns [formik.getFieldProps(), formik.getFieldMeta()]
    // which we can spread on <input> and alse replace ErrorMessage entirely.
    const [field, meta] = useField(props);
    return (
        <>
            <label htmlFor={props.id || props.name}>{label}</label>
            <input className="text-input" {...field} {...props} />
            {meta.touched && meta.error ? (
                <div className="error">{meta.error}</div>
            ) : null}
        </>
    );
};

const Home = (props) => {

    const handleSubmit = async (values) => {
        await fetch('/api/activities', {
            method: 'POST',
            body: values,
            headers: {'Content-Type': 'application/json'}
        }).then((response) => {
            if(response.status === 200){
                alert("udalo sie");
            }else{
                alert("nie udalo sie");
            }
        });
    };

    return (<>
        <Formik
            initialValues={{
                activityCategory: "",
                description: "",
                startTime: null,
                endTime: null
            }}
            validationSchema={Yup.object({
            })}
            onSubmit={(values, { setSubmitting }) => {
                handleSubmit(values);
                setSubmitting(false);
            }}
        >
            <Form>
                <MyTextInput name="activityCategory" type="text" placeholder="Category"/>
                <MyTextInput name="description" type="text" placeholder="Description"/>
                <MyTextInput name="startTime" type="date" label="Start Time"/>
                <MyTextInput name="endTime" type="date" label="End Time"/>

                <button type="submit">Submit</button>
            </Form>
        </Formik>
    </>);
};

export default Home;