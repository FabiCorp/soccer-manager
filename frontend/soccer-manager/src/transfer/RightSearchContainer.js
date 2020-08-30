import React from 'react';
import Button from '@material-ui/core/Button';
import TextField from '@material-ui/core/TextField';
import { makeStyles } from '@material-ui/core/styles';

const useStyles = makeStyles(() => ({
    searchButton: {
        width: '150px',
        height: '40px',
        marginRight: '15px'
    },
    rightSearchContainer: {
        gridRow: '1 / 4',
        gridColumn: '7 / 11',
        display: 'flex',
        flexDirection: 'column'
    },
    searchRowContainer: {
        marginBottom: '12px'
    },
    numberField: {
        width: '100px',
        marginRight: '15px',
        // height: '40px',
    }
}));

const RightSearchContainer = _ => {
    const classes = useStyles();

    return (
    <div className={classes.rightSearchContainer}>
        <div className={classes.searchRowContainer}>
            <Button variant="contained" color="primary" className={classes.searchButton}>
                Age
            </Button>
            <TextField
                className={classes.numberField}
                label="from"
                type="number"
                size="small"
                InputLabelProps={{
                    shrink: true,
                }}
                variant="outlined"
            />
            <TextField
                className={classes.numberField}
                label="to"
                type="number"
                size="small"
                InputLabelProps={{
                    shrink: true,
                }}
                variant="outlined"
            />
        </div>
        <div className={classes.searchRowContainer}>
            <Button variant="contained" color="primary" className={classes.searchButton}>
                Market Value
            </Button>
            <TextField
                className={classes.numberField}
                label="from"
                type="number"
                size="small"
                InputLabelProps={{
                    shrink: true,
                }}
                variant="outlined"
            />
            <TextField
                className={classes.numberField}
                label="to"
                type="number"
                size="small"
                InputLabelProps={{
                    shrink: true,
                }}
                variant="outlined"
            />
        </div>
        <div className={classes.searchRowContainer}>
            <Button variant="contained" color="primary" className={classes.searchButton}>
                Age
            </Button>
        </div>
        <div className={classes.searchRowContainer}>
            <Button variant="contained" color="primary" className={classes.searchButton}>
                Age
            </Button>
        </div>
    </div>)
}

export default RightSearchContainer;